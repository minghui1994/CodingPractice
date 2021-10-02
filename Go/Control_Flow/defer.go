package main

import (
	"fmt"
	"io/ioutil"
	"log"
	"net/http"
)

func main() {

	// When defer is used, the function will run everything and skip the code that
	// is being deferred, before the function ends, the deferred code will run.

	// The last code to be deferred will run first in the end, LIFO
	// print("start")
	// defer print("middle")
	// print("end")
}

func deferHttpRequestExample() {
	// Request robots.txt from google
	res, err := http.Get("http://www.google.com/robots.txt")
	if err != nil {
		log.Fatal(err)
	}

	defer res.Body.Close()
	robots, err := ioutil.ReadAll(res.Body)

	if err != nil {
		log.Fatal(err)
	}

	fmt.Printf("%s", robots)
}

func whatWillBePrinted() {

	// On first look may think that end will be printed, however, when the defer
	// keyword is used, the variable a will be the value at the time it is being deferred.
	// Therefore, "start" will be printed.
	a := "start"
	defer print(a)
	a = "end"
}

func testDefer() {
	defer print("hello")
	defer print("world")
	defer print("test")
}

func print(str string) {
	fmt.Println(str)
}
