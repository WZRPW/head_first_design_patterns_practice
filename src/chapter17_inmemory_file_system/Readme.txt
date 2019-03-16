This is the document about the design plan of  An In-memory File System

Main Functionality of this system:
1. It has files, directories (which recursively contains files/sub-directories)
2. MetaData of files/directories: name, creation time, access time, modification time, file size, file type
3. A file system can be modoled as a tree consisting of files and directories
   3.1 Leaf nodes: files or empty directories
   3.2 How to count total number of files and directories