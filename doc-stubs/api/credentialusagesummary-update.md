---
title: "Update credentialUsageSummary"
description: "Update the properties of a credentialUsageSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update credentialUsageSummary
Namespace: microsoft.graph



Update the properties of a [credentialUsageSummary](../resources/credentialusagesummary.md) object.

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
PATCH /credentialUsageSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [credentialUsageSummary](../resources/credentialusagesummary.md) object.

The following table shows the properties that are required when you update the [credentialUsageSummary](../resources/credentialusagesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|authMethod|usageAuthMethod|**TODO: Add Description**. Possible values are: `email`, `mobileSMS`, `mobileCall`, `officePhone`, `securityQuestion`, `appNotification`, `appCode`, `alternateMobileCall`, `fido`, `appPassword`, `unknownFutureValue`.|
|failureActivityCount|Int64|**TODO: Add Description**|
|feature|featureType|**TODO: Add Description**. Possible values are: `registration`, `reset`, `unknownFutureValue`.|
|successfulActivityCount|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [credentialUsageSummary](../resources/credentialusagesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_credentialusagesummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/credentialUsageSummary
Content-Type: application/json
Content-length: 194

{
  "@odata.type": "#microsoft.graph.credentialUsageSummary",
  "authMethod": "String",
  "failureActivityCount": "Integer",
  "feature": "String",
  "successfulActivityCount": "Integer"
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
  "@odata.type": "#microsoft.graph.credentialUsageSummary",
  "id": "e1ef013b-013b-e1ef-3b01-efe13b01efe1",
  "authMethod": "String",
  "failureActivityCount": "Integer",
  "feature": "String",
  "successfulActivityCount": "Integer"
}
```

