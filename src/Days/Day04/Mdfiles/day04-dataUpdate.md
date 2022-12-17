Day04
===

Data type update
---

* Pre:
  * **Do not** include boolean variable
  * char variable can be seen as a number
* Automated Type Update:
  * from a smaller range update to a larger range:
  * [Code example](../Codes/VariableTypeTest.java)
  * **Char**: data range smaller than int:
    * char + int = int
    * double > float > long >int > char = short = byte
  * if **byte**, **char**, **short** do the computations **each other**, the result will be **int**
  
  [Back to Director](https://github.com/WestbrookYuan/Java-Learning/blob/4bbd43808c5b55f1ab9f754055cdaa7899ffa406/README.md)