
Declare and Initialize Variables:

text → A long string containing input text.
result → Empty string to store words with punctuation.
totalCount → Integer to keep track of words with punctuation.
Define Main Function:

Create an instance of the Punctuation class.
Call the method searchForPunctuation().
Define searchForPunctuation() Method:

Call findPunctuationWords() to identify words with punctuation.
Call printResults(result) to print the output.
Define findPunctuationWords() Method:

Set lastIndex = -1 (tracks the start of words).
For each character i in text:
If the current character is a space or newline:
Extract the word from lastIndex + 1 to i.
Pass the word to analyzePunctuation() method.
Append the returned result to result.
Update lastIndex to the current position i.
Define analyzePunctuation() Method:

Trim the input word to remove extra spaces.
For each character in the word:
If the character is not a letter or digit:
Increment totalCount by 1.
Return the original word followed by a newline (\n).
If no punctuation is found, return an empty string.
Define printResults() Method:

Print the message: "The following words contain punctuation:".
Print the result string containing words with punctuation.
Print the total count of words with punctuation.
