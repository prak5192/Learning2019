#!python

# Pass the folder name as argument for which we want to test and create ignore files.
# hat folder should be in the same directory from which the script is running or else
#pass the absolute path of the folder.

import sys
import os

# This method will only print the directory tree structure.
def walkdir(dirname):
    for cur, _dirs, files in os.walk(dirname):
        pref = ''
        head, tail = os.path.split(cur)
        while head:
            pref += '---'
            head, _tail = os.path.split(head)
        print(pref+tail)
        for f in files:
            print(pref+'---'+f)


# Create a empty file in provided directory.
def touch(path):
    filename ="ignore.txt"
    filepath = os.path.join(path,filename)
    try:
        f=open(filepath,'w')
        f.close()
    except IOError:
        pritn("Wrong Path")
        
# Traverse recursively into the directory.
def createfile(dirname):
    for cur, _dirs, files in os.walk(dirname):
        print(cur)
        print(_dirs)
        print(files)
        if os.listdir(cur)==[]:
            print("Empty")
            #Create a empty file (.keep.txt)
            touch(cur)
        
           
#walkdir("TestFolder")
#createfile("TestFolder")

def __main__():
    print("Hello from python %s\n" %(sys.version,))
    print ("Program Name: " + sys.argv[0])

    if(len(sys.argv) == 1):
        print("No folder name is passed. Using the default one")
        sys.argv = [sys.argv[0], "EclipseWorkSpace"]
    else:
        if(len(sys.argv) == 2):
            print("Folder name  passed is: " + sys.argv[1])
        else:
            exit
     
    arguments = sys.argv[1:]
    count = len(arguments)
    createfile(arguments[0])    
            
    
if __name__ == '__main__':
    __main__()
