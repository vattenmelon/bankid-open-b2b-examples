#!/usr/bin/env bash

JAVA_HOME="/System/Library/Frameworks/JavaVM.framework/Versions/Current/Commands"

# Change if the merchant's originator is not BINAS.
ORIGINATOR="BINAS"

# Change to actual common name.
COMMON_NAME="roflmao AS"

KEY_STORE="${COMMON_NAME}.jks"
AUTH_CSR="${COMMON_NAME}-auth.csr"
SIGN_CSR="${COMMON_NAME}-sign.csr"
AUTH_PKCS7="${COMMON_NAME}-${ORIGINATOR}-auth.p7"
SIGN_PKCS7="${COMMON_NAME}-${ORIGINATOR}-sign.p7"

# This password is used for authentication/signing with the BankID and must be protected!
STORE_PASSWORD="xxxxx"
