Day04
===

Data type update
---

* Pre:
  * **Do not** include boolean variable
  * char variable can be seen as a number
* Automated Type Update:
  * from a smaller range update to a larger range:
  
  * **Char**: data range smaller than int:
    * char + int = int
    * double > float > long >int > char = short = byte
  * if **byte**, **char**, **short** do the computations **each other**, the result will be **int**

  * [Code example](../Codes/VariableTypeTest.java)
