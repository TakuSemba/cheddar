package main

import (
	"log"
	"time"

	"./proto"

	proto1 "github.com/golang/protobuf/proto"
)

func main() {
	user := &proto.User{
		Address:               "aaaa@b.com",
		Password:              "password",
		Name:                  "kk",
		FirstName:             "kazuma",
		LastName:              "kimura",
		Description:           "よろしくお願いします",
		Image:                 "/file/no/path/image.jpg",
		Phone:                 "09012345678",
		FirebaseToken:         "token",
		IsNotificationEnabled: true,
		CreatedAt:             time.Now().Unix(),
		UpdatedAt:             time.Now().Unix(),
	}
	data, err := proto1.Marshal(user)
	log.Println(user)
	log.Println(data)
	if err != nil {
		log.Fatal("marshaling error: ", err)
	}
	newUser := &proto.User{}
	err = proto1.Unmarshal(data, newUser)
	if err != nil {
		log.Fatal("unmarshaling error: ", err)
	}
	// Now user and newUser contain the same data.
	if user.GetName() != newUser.GetName() {
		log.Fatalf("data mismatch %q != %q", user.GetName(), newUser.GetName())
	}
	// etc.
}
