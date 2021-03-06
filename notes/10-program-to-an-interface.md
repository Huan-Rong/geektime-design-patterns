# 10 面向接口编程而非面向实现编程

> Program to an interface, not an implementation.

**面向抽象编程**更能体现这一设计原则的初衷。抽象能够提高代码的可扩展性。 
接口是一组协议或约定，是功能提供者提供给使用者的一个功能列表。应用这条设计原则，可以将接口和实现分离，**封装不稳定的实现，暴露稳定的接口。**

在进行编程实践时，不要受到具体编程语言的语法限制，因为早在许多编程语言出现之前，这条设计原则就出现于 1994 年 GoF 「设计模式」这本书。

## 避免过度使用

使用这条原则时，需要始终记住使用该原则的初衷：封装不稳定的实现，暴露稳定的接口。如果业务场景中，只有一种实现方式，未来也不可能被其他实现方式替换，那么就没有必要为其设计接口，也没有必要基于接口编程，这样一来就可以极大地减少开发的负担，毕竟抽象本身是一个比较难的工作。

越是不稳定的系统，我们越是要在代码的可扩展性、可维护性上下功夫。相反，如果系统特别稳定，基本上不需要维护，那就没有必要为其扩展性而投入不必要的开发时间。
