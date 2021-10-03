package main

import (
	"fmt"
)

func main() {
	run()
	fmt.Println("Returned normally from run()")
}

func run() {

	// Recover is only useful in deferred function!!
	defer func() {
		if r := recover(); r != nil {
			fmt.Println("Recovered!")
		}
	}()

	fmt.Println("Calling Recursive function recurr(i int)")
	recurr(0)
	fmt.Println("Returned normally from recurr(i int)")
}

func recurr(i int) {
	if i > 3 {
		fmt.Println("Panicking")
		panic(fmt.Sprintf("%v", i))
	}

	defer fmt.Println("Defer in recurr(i int)", i)
	fmt.Println("Printing in recurr(i int)", i)
	recurr(i + 1)
}
