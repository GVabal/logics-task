### Task:
Please write code for below problem and send back your solution:\
You will have a triangle (which is a binary tree) input below and you need to find the maximum sum
of the numbers per the given rules below:
1. You will start from the top and move downwards to an adjacent number as in below.
2. You are only allowed to walk downwards and diagonally.
3. You should walk over the numbers as evens and odds subsequently. Suppose that you are on an
even number the next number you walk must be odd, or if you are stepping over an odd number the
next number must be even. In other words, the final path would be like
Odd -> even -> odd -> even ...
4. You must reach to the bottom of the pyramid.

Your goal is to find the maximum sum if you walk the path. Assume that there is at least 1 valid path
to the bottom. If there are multiple paths giving the same sum, you can choose any of them.

### Question:

Per the above rules, what is the maximum sum of the below input? It means please take this
pyramid as an input (as file or constants directly inside the code) for your implementation and solve
by using it.
```
215
192 124
117 269 442
218 836 347 235
320 805 522 417 345
229 601 728 835 133 124
248 202 277 433 207 263 257
359 464 504 528 516 716 871 182
461 441 426 656 863 560 380 171 923
381 348 573 533 448 632 387 176 975 449
223 711 445 645 245 543 931 532 937 541 444
330 131 333 928 376 733 017 778 839 168 197 197
131 171 522 137 217 224 291 413 528 520 227 229 928
223 626 034 683 839 052 627 310 713 999 629 817 410 121
924 622 911 233 325 139 721 218 253 223 107 233 230 124 233
```

<details> 
  <summary>Click here to see the answer</summary>
   Answer: 8186 
</details>
