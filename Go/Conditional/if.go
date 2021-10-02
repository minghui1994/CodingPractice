package main

import (
	"fmt"
)

func main() {
	number := 50
	guess := 30

	// Same as java but without the ()
	// putting () works as well
	if guess < number {
		fmt.Println("Too Low")
	} else if guess > number {
		fmt.Println("Too High")
	} else {
		fmt.Println("Got It!")
	}
}
