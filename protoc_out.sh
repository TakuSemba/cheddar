#!/usr/bin/env bash
protoc --proto_path=protos --go_out=proto protos/*.proto
protoc --proto_path=protos --java_out=java protos/*.proto
