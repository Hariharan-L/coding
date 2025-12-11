import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class Simple_API {
  public static void main(String[] args) throws IOException, InterruptedException {
    var url = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/salem?unitGroup=us&key=5C4CFBCTVFVVALTJRGS9FX3L2&contentType=json";
    var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
    var client = HttpClient.newBuilder().build();
    var response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.statusCode());
    System.out.println(response.body());
  }
}
