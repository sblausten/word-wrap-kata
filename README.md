## Word Wrap Kata

I picked up this kata by [Martin Fowler](http://codingdojo.org/kata/WordWrap/) to practice TDD - specifically the all too common occurance in TDD when you are slowly building up your tests and then get to a stage where the next logical test seems to demand a significant chunk of business logic to be written in order for it to pass. 

This is not a fault of TDD, rather a fault of the tests being written. I experienced this the first time I tried it and basically wrote the whole algorithm to pass a single test. Unfortunately I had also missed two very useful Java String methods - substring() and indexOf/lastIndexOf - which meant I used a very verbose array of chars to get to my solution. 

I then read through [Uncle Bob's account](https://thecleancoder.blogspot.co.uk/2010/10/craftsman-62-dark-path.html) of doing this kata the first time. It was a revelation to me! He described the same fundamental testing problem I had fallen into and then showed how he was talked around it by a colleage. 

I let this brilliant narrative rest for an evening and then restarted the kata determined not to fall into the same testing trap. Unfortunately I did remember some of the tests Uncle Bob had described so it wasn't a strictly honest attempt but I built up the algorithm far more incrementally (with the help of the aforementioned methods) and have taken away a huge ammount from the practice!

On to the next kata. 
