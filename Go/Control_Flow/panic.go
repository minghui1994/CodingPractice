package main

import (
	"fmt"
	"net/http"
	//"strconv"
)

func main() {

	// panic is exception in GoLang.

	// a, b := 1, 0

	// // Divide by 0 exception
	// ans := a / b
	// print(strconv.Itoa(ans))
	// testPanic()
	testPanic2()

}

func testPanic() {
	print("Start")
	// Throw an exception with a message
	panic("Something bad happened")
	print("End")
}

func testPanic2() {
	// A function that will print Hello Go in port 8080
	// panic will be thrown if you open another terminal and run the program, since
	// port 8080 is blocked.
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		w.Write([]byte("Hello Go!"))
	})
	err := http.ListenAndServe(":8080", nil)
	if err != nil {
		panic(err.Error())
	}
}

func print(str string) {
	fmt.Println(str)
}
