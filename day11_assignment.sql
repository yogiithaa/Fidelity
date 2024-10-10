create table tblCustomers (
CustomerID int primary key,
CustomerName varchar(100) not null,
ContactName varchar(100),
Address varchar(255),
City varchar(100),
PostalCode varchar(20),
Country varchar(100) default 'Canada'
);

Insert into tblCustomers (CustomerID, CustomerName, ContactName, Address, City, PostalCode)
values 
(102,'Yogitha', 'Yogitha C', 'Sampige road', 'Bangalore', '560003' ),
(103,'Ananya', 'Ananya P', 'Mission road', 'Bangalore', '560001' );

SELECT * FROM tblCustomers;

Alter table tblCustomers
add email varchar(100);


create table tblSuppliers (
SupplierID int primary key,
SupplierName varchar(100) not null,
ContactName varchar(100),
Address varchar(255),
City varchar(100),
PostalCode varchar(20),
Country varchar(100)
);

Insert into tblSuppliers (SupplierId, SupplierName, ContactName, Address, City, PostalCode, Country)
values 
(1001, 'XYZ', 'xyz', 'lalbagh', 'bangalore', '560020', 'india'),
(1002, 'ABC', 'abc', 'rr nagar', 'mysore', '235601', 'india');

SELECT * FROM tblSuppliers;

create table tblShippers (
ShipperID int primary key,
ComapnyName varchar(100) not null unique,
Phone varchar(20)
);


Insert into tblShippers (ShipperID, ComapnyName, Phone)
values (1, 'S1', '1234567890'),
(2, 'S2', '9876543210');

SELECT * FROM tblShippers;

create table tblProducts (
ProductId int primary key,
ProductName varchar(100) not null,
SupplierId int,
UnitPrice Decimal(10, 2),
Foreign key (SupplierID) references tblSuppliers(SupplierID)
);

Insert into tblProducts (ProductID, ProductName, SupplierID, UnitPrice)
values (1, 'ProdA', 1001, 100),
 (2, 'ProdB', 1002, 250);

SELECT * FROM tblProducts;

Update tblProducts 
set UnitPrice = UnitPrice * 1.10
where ProductID = 2;

create table tblOrders (
OrderID int primary key,
CustomerID int,
ShipperID int,
OrderDate date,
ShippedDate date,
Foreign key (CustomerId) references tblCustomers(CustomerID),
Foreign key (ShipperID) references tblShippers(ShipperID),
Check (ShippedDate > OrderDate)
);

Insert into tblOrders(OrderID, CustomerID, ShipperID, OrderDate, ShippedDate)
values (1,102,1,'2024-10-08', '2024-10-10'),
(2,103,2,'2024-10-0', '2024-10-09');

SELECT * FROM tblOrders;

Delete from tblOrders 
where ShippedDate < '2024-10-08';


create table tblOrderDetails (
OrderDetailID int primary key,
OrderID int,
ProductID int,
Quantity int Check (Quantity > 10),
Foreign key (OrderID) references tblOrders(OrderID),
Foreign key (ProductID) references tblProducts(ProductID)
);

Insert into tblOrderDetails ( OrderDetailID, OrderID, ProductID, Quantity)
values ( 1, 1, 1, 16);

SELECT * FROM tblOrderDetails;
