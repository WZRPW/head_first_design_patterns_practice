package chapter1_strategy_pattern;

//note:03/15/2019
//original problem:
//7.3 version BookMark has start time stamp
//7.4 version BookMark has both start and end time stamp
//7.4 client cannot send BookMark OBJs to 7.3 server (backward compatibility issue
//Because the BookMark objects are different between two versions when doing serialization

//Seems that using interface is not an ideal solution here.
public interface BookMark {

}
