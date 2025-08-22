Feature: checking the multiple searches
Scenario: checking the search button was worked or not
Given loged userr and searchbutton available or not
When clicking on the search button
And enter <input>
Then give the matched results
Examples:
|input|
|Account|
|Settings|
|Bank|