SUMMARY = "A Python library to sanitize/validate a string such as filenames/file-paths/etc."
HOMEPAGE = "https://github.com/thombashi/pathvalidate"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5936a2ac3ff61cef91b1ebcb9800dbd8"

SRC_URI[sha256sum] = "59b5b9278e30382d6d213497623043ebe63f10e29055be4419a9c04c721739cb"

DEPENDS += "python3-setuptools-scm-native"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "pathvalidate"
