package main

import (
	"fmt"
	"math"
)

func main() {
	var P,N,G,L, res float64

	fmt.Scanln(&P)
	fmt.Scanln(&N)
	fmt.Scanln(&G)
	fmt.Scanln(&L)

	res = (2*P+(N-P)+G)/L

	if res == math.Trunc(res){
		fmt.Println(res)
	} else{
		fmt.Println(0)
	}
}