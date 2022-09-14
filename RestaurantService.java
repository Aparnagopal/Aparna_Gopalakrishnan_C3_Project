import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public String findRestaurantByName(String restaurantName){
        int j = 0;
        for (int i = 0; i < restaurants.size(); i++) {
            if (restaurants.get(i).getName().equals (restaurantName)) {
                j = restaurants.size() + 2;
                i = j;
                            }
        }
        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
        if (j == restaurants.size() + 2) {
            return restaurantName;
        }
        return null;
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public String removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        String restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
