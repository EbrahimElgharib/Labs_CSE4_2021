# '''
#     By      : "Ebrahim Elsayed ElGharib Nasr"
#     email   : "ebrahimelsayed010@gmail.com"
#     edu     : CSE4 - term2
#     Date    : May, 2021
# '''



import re # import regular expression package
# import codecs # for files
import os

pattern = r'\b(((25[0-5])|(2[0-4][0-9])|(1[0-9]?[0-9]?)|1|0)\.){3}((25[0-5])|(2[0-4][0-9])|(1[0-9]?[0-9]?)|1|0)\b'
pattern_compile = re.compile(pattern)

# read all file to get content
fread=open("reading_file.txt", "r")
if fread.mode == 'r':
    txt =fread.read()

# compile pattern ===> regular expression 
matches = pattern_compile.finditer(txt)

# open file to write
fwrite = open("writing_file.txt", "w")

# loop around every ip/line
for match in matches:
    # print(match.group(0))
    fwrite.writelines(match.group(0) + os.linesep)

# close file
fwrite.close()