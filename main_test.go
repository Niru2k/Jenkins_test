package main

import (
	"testing"
)

func TestHelloWorld(t *testing.T) {
	exp := "Hello World"
	str := HelloWorld()
	if exp != str {
		t.Errorf("Wrong  string %s:", str)
	}
}
