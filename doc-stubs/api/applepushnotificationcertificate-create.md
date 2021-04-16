---
title: "Create applePushNotificationCertificate"
description: "Create a new applePushNotificationCertificate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create applePushNotificationCertificate
Namespace: microsoft.graph



Create a new [applePushNotificationCertificate](../resources/applepushnotificationcertificate.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST ** Collection URI for microsoft.graph.applePushNotificationCertificate not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [applePushNotificationCertificate](../resources/applepushnotificationcertificate.md) object.

The following table shows the properties that are required when you create the [applePushNotificationCertificate](../resources/applepushnotificationcertificate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appleIdentifier|String|Apple Id of the account used to create the MDM push certificate.|
|certificate|String|**TODO: Add Description**|
|certificateSerialNumber|String|Certificate serial number. This property is read-only.|
|certificateUploadFailureReason|String|The reason the certificate upload failed.|
|certificateUploadStatus|String|The certificate upload status.|
|expirationDateTime|DateTimeOffset|The expiration date and time for Apple push notification certificate.|
|lastModifiedDateTime|DateTimeOffset|Last modified date and time for Apple push notification certificate.|
|topicIdentifier|String|Topic Id.|



## Response

If successful, this method returns a `201 Created` response code and an [applePushNotificationCertificate](../resources/applepushnotificationcertificate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_applepushnotificationcertificate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.applePushNotificationCertificate not found
Content-Type: application/json
Content-length: 340

{
  "@odata.type": "#microsoft.graph.applePushNotificationCertificate",
  "appleIdentifier": "String",
  "certificate": "String",
  "certificateSerialNumber": "String",
  "certificateUploadFailureReason": "String",
  "certificateUploadStatus": "String",
  "expirationDateTime": "String (timestamp)",
  "topicIdentifier": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.applePushNotificationCertificate"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.applePushNotificationCertificate",
  "id": "be6b3bc1-3bc1-be6b-c13b-6bbec13b6bbe",
  "appleIdentifier": "String",
  "certificate": "String",
  "certificateSerialNumber": "String",
  "certificateUploadFailureReason": "String",
  "certificateUploadStatus": "String",
  "expirationDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "topicIdentifier": "String"
}
```

