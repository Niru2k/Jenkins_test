// Here is an example code in the Go programming language.
// This code simply prints out the message "Hello World" to the console when it is executed.
package main

import "fmt"

func main() {
	data := HelloWorld()
	fmt.Println("Data check")
	fmt.Println(data)
}

func HelloWorld() string {
	return "Hello World"
}
