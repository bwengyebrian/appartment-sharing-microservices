package edu.mum.ea.project.catalogservice;

import com.google.common.collect.ImmutableMap;
import edu.mum.ea.project.catalogservice.dto.Apartment;
import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class GraphQLDataFetchers {

    private static List<Map<String, String>> books = Arrays.asList(
            ImmutableMap.of("id", "book-1",
                    "name", "Harry Potter and the Philosopher's Stone",
                    "pageCount", "223",
                    "authorId", "author-1"),
            ImmutableMap.of("id", "book-2",
                    "name", "Moby Dick",
                    "pageCount", "635",
                    "authorId", "author-2"),
            ImmutableMap.of("id", "book-3",
                    "name", "Interview with the vampire",
                    "pageCount", "371",
                    "authorId", "author-3")
    );

    private static List<Map<String, String>> authors = Arrays.asList(
            ImmutableMap.of("id", "author-1",
                    "firstName", "Joanne",
                    "lastName", "Rowling"),
            ImmutableMap.of("id", "author-2",
                    "firstName", "Herman",
                    "lastName", "Melville"),
            ImmutableMap.of("id", "author-3",
                    "firstName", "Anne",
                    "lastName", "Rice")
    );

    private static List<Apartment> apartments = Arrays.asList(new Apartment(1,"Brians","God apartments ","https://cdn.vox-cdn.com/thumbor/E0jNRUTI81RBBRMSA_ZU7vq7I4g=/0x0:2400x1602/1200x675/filters:focal(682x772:1066x1156)/cdn.vox-cdn.com/uploads/chorus_image/image/54241701/LINEA_NicholasJamesPhoto_8.0.jpeg"),new Apartment(2," Apartments","Fully funished with parking ","https://i.pinimg.com/736x/08/f9/1d/08f91d5580f8e0bf0235165dde6d9af0.jpg"));

    public DataFetcher getApartmentsDataFetcher() {
        return dataFetchingEnvironment -> {
            Integer count = dataFetchingEnvironment.getArgument("count");
            return apartments
                    .stream().limit(count).collect(Collectors.toList());
        };
    }

//    public DataFetcher getBookByIdDataFetcher() {
//        return dataFetchingEnvironment -> {
//            String bookId = dataFetchingEnvironment.getArgument("id");
//            return books
//                    .stream()
//                    .filter(book -> book.get("id").equals(bookId))
//                    .findFirst()
//                    .orElse(null);
//        };
//    }
//
//    public DataFetcher getAuthorDataFetcher() {
//        return dataFetchingEnvironment -> {
//            Map<String, String> book = dataFetchingEnvironment.getSource();
//            String authorId = book.get("authorId");
//            return authors
//                    .stream()
//                    .filter(author -> author.get("id").equals(authorId))
//                    .findFirst()
//                    .orElse(null);
//        };
//    }
}
