---
title: "Update userCredentialUsageDetails"
description: "Update the properties of a userCredentialUsageDetails object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userCredentialUsageDetails
Namespace: microsoft.graph



Update the properties of a [userCredentialUsageDetails](../resources/usercredentialusagedetails.md) object.

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
PATCH /print/reports/userCredentialUsageDetails/{userCredentialUsageDetailsId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userCredentialUsageDetails](../resources/usercredentialusagedetails.md) object.

The following table shows the properties that are required when you update the [userCredentialUsageDetails](../resources/usercredentialusagedetails.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|authMethod|usageAuthMethod|**TODO: Add Description**. Possible values are: `email`, `mobileSMS`, `mobileCall`, `officePhone`, `securityQuestion`, `appNotification`, `appCode`, `alternateMobileCall`, `fido`, `appPassword`, `unknownFutureValue`.|
|eventDateTime|DateTimeOffset|**TODO: Add Description**|
|failureReason|String|**TODO: Add Description**|
|feature|featureType|**TODO: Add Description**. Possible values are: `registration`, `reset`, `unknownFutureValue`.|
|isSuccess|Boolean|**TODO: Add Description**|
|userDisplayName|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [userCredentialUsageDetails](../resources/usercredentialusagedetails.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_usercredentialusagedetails"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/print/reports/userCredentialUsageDetails/{userCredentialUsageDetailsId}
Content-Type: application/json
Content-length: 284

{
  "@odata.type": "#microsoft.graph.userCredentialUsageDetails",
  "authMethod": "String",
  "eventDateTime": "String (timestamp)",
  "failureReason": "String",
  "feature": "String",
  "isSuccess": "Boolean",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userCredentialUsageDetails",
  "id": "6b5a48db-48db-6b5a-db48-5a6bdb485a6b",
  "authMethod": "String",
  "eventDateTime": "String (timestamp)",
  "failureReason": "String",
  "feature": "String",
  "isSuccess": "Boolean",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```

