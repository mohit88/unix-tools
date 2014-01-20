Unix Tools
==========

## WC

MP_Wc.sh  file-name           

Example ->    `MP_Wc  one.txt`
           
           It will display word count,character count and lines count presented in this given file.


## Head

* MP_Head  file-name  -[No of lines] 

Example ->  `MP_Head -5 one.txt`

           It will display first 5 lines from given file.
           

* MP_Head file-name 
           
Example -> `MP_Head one.txt`
           
           It will display default first 10 lines from given file


## Tail

* MP_Tail -[No of lines]  file-name
           
Example ->  `MP_Tail -5 one.txt`

           It will display last 5 lines from given file.


* MP_Tail file-name 
           
Example -> `MP_Tail one.txt`
           
           It will display default last 10 lines from given file.


## Uniq

MP_Uniq file-name
           
Example -> `MP_Uniq one.txt`

           It will display uniq lines among the entire file


## Sort

* MP_Sort file-name
           
Example -> `MP_Sort one.txt`

           It will display all content of the file by sorting ascending order.


## Cut

* MP_Cut file-name -f-start-end
           
Example -> `MP_Cut one.txt -f-1-2 `

* MP_Cut file-name -c-start-end

           It will display field from 1 to 2 of every line in given file .
           
Example -> `MP_Cut one.txt -c-2-3`

           It will display the character from 2 to 3 of every line from given file.


## Reduce space

MP_ReduceSpaces file-name

Example -> `MP_ReduceSpaces one.txt`

           It will be remove all extra spaces from the given file and write to same file.


How To Install
==============

* Copy the whole package of Unix Tools.

* And then run `install.sh` in command line.

* Now you can run above unix tool commands from command line.
