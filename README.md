# kata-demo
* http://codingdojo.org/

### Step
* Global
  * Cmd + e -> Recent Files
  * Code Complete -> Cmd + Shift + Enter 
  * Organize Imports -> Cmd + Alt + O
  * Reformat Code -> Cmd + Alt + L
* Create Test Class
  * Cmd + 1 -> Project Window
  * Ctrl + n -> Create Java Class
  * Ctrl + n -> Create Test Method
* Create Target Class (Arrange)
  * Potter potter = new Potter(); -> F2 -> Navigate to Next Error
  * Potter potter = new Potter(); -> Alt + Enter -> Show Context Actions
* Create Target Method (Act)
  * potter.calPrice(Arrays.asList(potter)); -> F2 -> Navigate to Next Error
  * potter.calPrice(Arrays.asList(potter)); -> Alt + Enter -> Show Context Actions
  * Int price = potter.calPrice(Arrays.asList(potter)); -> Alt + Enter -> Show Context Actions
* (Assert)
  * assertEquals(100, price); -> Alt + Enter -> Show Context Actions
* Run (Red)
  * Alt + Shift + F10 -> Run
  * Alt + Shift + F10 -> Run Last Configuration

### Test 3A
* Arrange The Resources
* Act The Target
* Assert Equals

### TDD Cycles
* Red
* Green
* Refactor

### Keywords
* Baby Step
  
### References
* https://tw.alphacamp.co/blog/2015-03-02-tdd-kata
* https://tw.alphacamp.co/blog/tdd-test-driven-development-example
* https://www.jetbrains.com/help/idea/tdd-with-intellij-idea.html
* https://marco79423.net/articles/%E7%AD%86%E8%A8%98-%E8%87%AA%E5%8B%95%E5%8C%96%E6%B8%AC%E8%A9%A6%E8%88%87-tdd-%E5%AF%A6%E5%8B%99%E9%96%8B%E7%99%BC/
* https://ithelp.ithome.com.tw/users/20107209/ironman/1278
* https://ithelp.ithome.com.tw/users/20010292/ironman/462