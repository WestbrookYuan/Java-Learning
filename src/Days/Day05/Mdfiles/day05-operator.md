Day05
===

Operator
---
* Operators are the special symbols:
  * Arithmetic Operators:
    * \*
    * /
    * %
    * \+
      * if using **Variable++**, the type of **Variable** will **not** be changed
    * \-
  * Assignment Operator:
    * =
      * if type is not equal between both sides, forced to convert it.
      * Can be used continually
      * if using **Variable+=1**, the type of **Variable** will **not** be changed
        * _**highly recommended**_ when developing
  * Relational Operators(all return a boolean):
    * ==
    * !=
    * <
    * <=
    * \>
    * \>=
    * instance of(**if object equals to a Class**)
  * Logical Operators:
    * **do not consider remained if true**
    * **Recommended when development**
    * &&
    * ||
    * !
  * **Bitwise Operators**(used in Leetcode):
    * **consider remained if true**
    * &: **bit by bit AND** of input Values
    * |: **bit by bit or** of input Values
    * ^: **bit by bit XOR** of input Values
    * ~: returns the one’s **complement** representation of the input value, i.e., with all bits inverted.
  * Shift Operators:
    * all based on **integers**
    * <<: shifts the bits of the number to the left and fills 0 on voids left as a result. Similar effect as multiplying the number with some power of two
    * \>>: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit depends on the sign of the initial number. Similar effect as dividing the number with some power of two.
    * \>>>:Unsigned **(always 0)** Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit is set to 0.
  * Ternary operator:
    * > condition ? if true : if false
* [Code example](../Codes/OperatorTest.java)

[Back to Director](https://github.com/WestbrookYuan/Java-Learning/)