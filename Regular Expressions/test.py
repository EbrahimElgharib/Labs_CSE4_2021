'''
    By      : "Ebrahim Elsayed ElGharib Nasr"
    email   : "ebrahimelsayed010@gmail.com"
    edu     : CSE4 - term2
    Date    : May, 2021
'''

# -*- encoding:utf-/ -*-

import re # import regular expression package

# pattern = '^.*\s*t.*t\s*.*$'
# string = 'this is teamt'
# result = re.findall(pattern, string)
# print(result)


pattern = r'\b(((25[0-5])|(2[0-4][0-9])|(1[0-9]?[0-9]?)|1|0)\.){3}((25[0-5])|(2[0-4][0-9])|(1[0-9]?[0-9]?)|1|0)\b'
txt = '''
line0

==>accepted
127.0.0.1           test01.     127.0.0.1

    192.168.1.1
192.168.1.255
255.255.255.255
0.0.0.0  accepted

linessss

==>rejected
1.1.1.01        # This is an invalid IP address! 
1.1.1.0Z        # This is an invalid IP address! 
30.168.1.255.1
127.1
192.168.1.256
-1.2.3.4
1.1.1.1*
3...3
'''

pattern_compile = re.compile(pattern)
matches = pattern_compile.finditer(txt)

for match in matches:
    print(match.group(0))
