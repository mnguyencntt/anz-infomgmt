# anz-notification

### API /send
URL: http://ec2-52-64-168-250.ap-southeast-2.compute.amazonaws.com:8080/api/anzplatform/v1/notification/send?orderId=11111&deliveryId=22222

```
{
	"status": "000",
	"data": {
		"notificationId": "5"
	},
	"message": ""
}
```

### API /
URL: http://ec2-52-64-168-250.ap-southeast-2.compute.amazonaws.com:8080/api/anzplatform/v1/notification
```
{
	"status": "000",
	"data": [{
		"id": 1,
		"receiverUserId": null,
		"subject": "Confirmation Order 11111",
		"contentBody": "Your order has been successful. Our delivery will be in 15 days.",
		"notificationType": null,
		"amount": null,
		"status": null,
		"message": null,
		"request": "orderId: 11111, deliveryId: 22222",
		"createdAt": null,
		"createdBy": null,
		"updatedAt": null,
		"updatedBy": null
	},
	{
		"id": 2,
		"receiverUserId": null,
		"subject": "Confirmation Order 11111",
		"contentBody": "Your order has been successful. Our delivery will be in 15 days.",
		"notificationType": null,
		"amount": null,
		"status": null,
		"message": null,
		"request": "orderId: 11111, deliveryId: 22222",
		"createdAt": null,
		"createdBy": null,
		"updatedAt": null,
		"updatedBy": null
	}],
	"message": null
}

```

### API /{notificationId}
URL: http://ec2-52-64-168-250.ap-southeast-2.compute.amazonaws.com:8080/api/anzplatform/v1/notification/1

```
{
	"status": "000",
	"data": {
		"id": 1,
		"receiverUserId": null,
		"subject": "Confirmation Order 11111",
		"contentBody": "Your order has been successful. Our delivery will be in 15 days.",
		"notificationType": null,
		"amount": null,
		"status": null,
		"message": null,
		"request": "orderId: 11111, deliveryId: 22222",
		"createdAt": null,
		"createdBy": null,
		"updatedAt": null,
		"updatedBy": null
	},
	"message": null
}
```
# anz-infomgmt
# anz-infomgmt
