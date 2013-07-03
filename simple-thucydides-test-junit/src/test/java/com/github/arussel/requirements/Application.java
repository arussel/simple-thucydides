package com.github.arussel.requirements;

import net.thucydides.core.annotations.Feature;
import net.thucydides.core.annotations.Narrative;

public class Application {

    @Narrative(
            title = "narrative for search",
            cardNumber = "SEARCH",
            text = {"In order to search",
                    "As a user",
                    "I should be able to search"},
            type = "S"
    )
    @Feature
    public class Search {
        @Narrative(
                title = "narrative for search by keyword",
                cardNumber = "CNSK",
                text = {"In order to search by keyword",
                        "as a user",
                        "I want to search by keyword"},
                type = "KW"
        )
        public class SearchByKeyword {}
        @Narrative(
                title = "narrative for search by multiple keywords",
                cardNumber = "MK",
                text = {"In order to search by multiple keywords",
                        "As a user",
                        "I want ot search by multiple keywords"},
                type = "MK"
        )
        public class SearchByMultipleKeywords {}
    }
}