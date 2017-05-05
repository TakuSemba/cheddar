# cheddar
Proto file example

## Setup
```console
$ brew install protobuf
$ brew install golang
$ export GOPATH=/your/go/path
$ export PATH=$PATH:$GOPATH/bin
$ go get -u github.com/golang/protobuf/{proto,protoc-gen-go}
```

## Usage

`protos/`にある.protoファイルを編集


```console
$ ./protoc_out.sh
```
`./proto`にgoのファイル、`java`にjavaのファイルが書き出される

