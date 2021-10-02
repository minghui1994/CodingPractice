package main

import (
	"fmt"
)

func main() {
	g := greeter{
		greeting: "Hello",
		name:     "Go",
	}
	g.greet()
}

type greeter struct {
	greeting string
	name     string
}

// Method
// Any variable of type greeter can invoke this function
// Same as normal function, but with a extra (type) in front after func keyword
func (g greeter) greet() {
	fmt.Println(g.greeting, g.name)
}
