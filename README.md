# ApachePOIDateformater

POI is the one of the common open source libraries introduced by Apache for interact (Inserting/Deleting/Reading) with applications in MS office package. Using POI library, we can easily create an interconnection with MS office application and our JAVA app.  

But most of the time, Apache POI doesn’t support for large Excel files. Because of that, most of developers are useing another third partition library call Streaming Reader for filtering specified excel sheets from large excel file.  But when we use this library some time reader doesn’t identify the exact cell type in excel file. Most of the time the cells, which we change the cell type as Date, Streaming reader, read this cell without any exception, but then we can notice, it displays a totally different number when we compare with exact value in the Excel cell.

Actually the reality is Streaming reader little bit intelligent than our eye, usually excel assign some formulated value for each date formatted cell for their calculation purpose. So what happens is streaming reader read that value instead of actual displayed value in excel cell.  

The reading value is not a random value, 01/Jan/1900 excel numbering as 01. So using a small conversion method we can easily convert these numbers in to actual date.

Here's the code, or you can simply use Convert Serial To Date library for that conversion process.

[Reference : Denuwan' Blog](https://denuwanhimangahettiarachchi.blogspot.com/2016/03/solution-for-apache-poi-date-format.html)
