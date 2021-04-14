#Anagram Program
###Task: 
- Imagine you have a file containing words of the English alphabet. Write a program
that takes this file as an input and writes all words from within the file that are
anagrams of each other to the console, with those words that are anagrams grouped
together.
- Two words are anagrams of each other if they share the same letters, but in a
different order (e.g. the words race, care).

####1.
* ```anagram_basic.txt``` run time: 30562320 nanosecond. In other words 0.03056232 second.

* ```words_alpha.txt``` run time: 1117483921 nanosecond. In other words 1.117483921 second.

####2. How do you verify your solution?

I made test run with relatively small and huge datasets, the program worked as expected.
You can find the datasets in the package as [small_dataset](anagram_basic.txt) 
and [huge_dataset](words_alpha.txt).

####3. How complex is your program? How will it perform on large datasets?

The program's complexity is O(n). O(n) grows linear,
hence the program's algorithm is not going to need drastic changes.
However, there can be changes in regards on making the performance more efficient 
which I explined at the 4th question.

####4. Imagine you have a large input file (e.g. multiple gigabytes) and only limited memory (100MB). How would your program perform? Please outline if and how you would change your solution (no need to implement this)

I think the program needs some changes to perform better 
if the input file size increases to multiple gigabytes.

I would 
- change Scanner to BufferedReader or BufferedInputStream instead. 
- make the program multi-threaded.
- use Java NIO.