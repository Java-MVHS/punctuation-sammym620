Pseudocode:
Main Method:

Initialize text with the given input.
Call searchIt(text) to process the text.
searchIt Method:

Call getPunctuationWords(text) to get a list of words containing punctuation.
Pass the list to printWords to display them.
getPunctuationWords Method:

Split the text into an array of words.
Initialize an empty list to store words with punctuation.
For each word in the array:
If checkForPunctuation(word) returns true, add the word to the list.
Return the list.
checkForPunctuation Method:

For each character in the word:
Check if it exists in the set of punctuation characters.
If found, return true.
If no punctuation is found, return false.
printWords Method:

For each word in the list:
Print the word.
