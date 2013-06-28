In order to become more knowledgeable
As a user
I want to be able to find the definition of the fruits I'm eating

Scenario: Looking up the definition of 'broccoli'
Given the user is on the Wikionary home page
When the user looks up the definition of the word 'broccoli'
Then they should see the definition 'A plant, Brassica oleracea var. italica, of the cabbage family, Brassicaceae; especially, the tree-shaped flower and stalk that are eaten as a vegetable.'
