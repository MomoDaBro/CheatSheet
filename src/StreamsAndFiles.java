import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAndFiles {

    public static void main(String[] args) throws IOException {

//        try (var reader = Files.newBufferedReader(Paths.get(args[0]))) {
//            while(true) {
//                String line = reader.readLine();
//                if(line == null) break;
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("phonebook.txt does not exist");
//            e.printStackTrace();
//        }

//        Files.lines(Paths.get(args[0]))
//                .forEach(Test::lambda);

        List<Person> people = new ArrayList<>();

        List<String> lines = Files.lines(Paths.get(args[0])).collect(Collectors.toList());
        for (String line : lines) {
            people.add(Person.parsePerson(line));
        }

        Files.lines(Paths.get("phonebook.txt"))
                .map(Person::parsePerson)
                .collect(Collectors.toList());


//                .map(s -> s.split(":"))
//                .map(Arrays::toString)
//                .forEach(System.out::println);
//
    }

}