package main

import (
	"fmt"
)

// lower camel case naming convention
type Doctor struct {
	number     int
	actorName  string
	companions []string
}

// Go does not support inheritance, instead it uses sth known as composition
// can add tag to the data, by itself it does nothing, use more as an information
type Animal struct {
	Name   string `required max: "100"`
	Origin string
}

type Bird struct {
	Animal
	SpeedKPH float32
	canFly   bool
}

func main() {

	aDoctor := Doctor{
		number:    3,
		actorName: "Jon Pertwee",
		companions: []string{
			"Liz Shaw",
			"Jo Grant",
			"Sarah Jane Smith",
		},
	}

	fmt.Println(aDoctor)
	fmt.Println(aDoctor.actorName)

	// Annoymous struct
	// Use for very short live struct
	aDoctor2 := struct{ name string }{name: "John Wick"}
	fmt.Println(aDoctor2)

	// ***************************************
	// ************* GO Composition **********
	// ***************************************
	b := Bird{}
	b.Name = "Emu"
	b.Origin = "Australia"
	b.SpeedKPH = 48
	b.canFly = false
	fmt.Println(b)

	c := Bird{
		Animal:   Animal{Name: "Emu", Origin: "Australia"},
		SpeedKPH: 48,
		canFly:   false,
	}
	fmt.Println(c)
}
