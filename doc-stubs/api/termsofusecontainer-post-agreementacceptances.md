---
title: "Create agreementAcceptance"
description: "Create a new agreementAcceptance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create agreementAcceptance
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new agreementAcceptance object.

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
POST /identityGovernance/termsOfUse/agreementAcceptances
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [agreementAcceptance](../resources/agreementacceptance.md) object.

The following table shows the properties that are required when you create the [agreementAcceptance](../resources/agreementacceptance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|agreementFileId|String|**TODO: Add Description**|
|agreementId|String|**TODO: Add Description**|
|deviceDisplayName|String|**TODO: Add Description**|
|deviceId|String|**TODO: Add Description**|
|deviceOSType|String|**TODO: Add Description**|
|deviceOSVersion|String|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|recordedDateTime|DateTimeOffset|**TODO: Add Description**|
|state|agreementAcceptanceState|**TODO: Add Description**. Possible values are: `accepted`, `declined`, `unknownFutureValue`.|
|userDisplayName|String|**TODO: Add Description**|
|userEmail|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [agreementAcceptance](../resources/agreementacceptance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_agreementacceptance_from_agreementacceptances"
}
-->
``` http
POST https://graph.microsoft.com/beta/identityGovernance/termsOfUse/agreementAcceptances
Content-Type: application/json
Content-length: 470

{
  "@odata.type": "#microsoft.graph.agreementAcceptance",
  "agreementFileId": "String",
  "agreementId": "String",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "deviceOSType": "String",
  "deviceOSVersion": "String",
  "expirationDateTime": "String (timestamp)",
  "recordedDateTime": "String (timestamp)",
  "state": "String",
  "userDisplayName": "String",
  "userEmail": "String",
  "userId": "String",
  "userPrincipalName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.agreementAcceptance"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.agreementAcceptance",
  "id": "e890bed6-bed6-e890-d6be-90e8d6be90e8",
  "agreementFileId": "String",
  "agreementId": "String",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "deviceOSType": "String",
  "deviceOSVersion": "String",
  "expirationDateTime": "String (timestamp)",
  "recordedDateTime": "String (timestamp)",
  "state": "String",
  "userDisplayName": "String",
  "userEmail": "String",
  "userId": "String",
  "userPrincipalName": "String"
}
```

