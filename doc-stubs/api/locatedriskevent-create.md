---
title: "Create locatedRiskEvent"
description: "Create a new locatedRiskEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create locatedRiskEvent
Namespace: microsoft.graph



Create a new [locatedRiskEvent](../resources/locatedriskevent.md) object.

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
POST ** Collection URI for Microsoft.IdentityProtectionServices.locatedRiskEvent not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [locatedRiskEvent](../resources/locatedriskevent.md) object.

The following table shows the properties that are required when you create the [locatedRiskEvent](../resources/locatedriskevent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [identityRiskEvent](../resources/identityriskevent.md)|
|userDisplayName|String|**TODO: Add Description** Inherited from [identityRiskEvent](../resources/identityriskevent.md)|
|userPrincipalName|String|**TODO: Add Description** Inherited from [identityRiskEvent](../resources/identityriskevent.md)|
|riskEventDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [identityRiskEvent](../resources/identityriskevent.md)|
|riskEventType|String|**TODO: Add Description** Inherited from [identityRiskEvent](../resources/identityriskevent.md)|
|riskLevel|riskLevel|**TODO: Add Description** Inherited from [identityRiskEvent](../resources/identityriskevent.md). Possible values are: `low`, `medium`, `high`, `hidden`, `none`, `unknownFutureValue`.|
|riskEventStatus|riskEventStatus|**TODO: Add Description** Inherited from [identityRiskEvent](../resources/identityriskevent.md). Possible values are: `active`, `remediated`, `dismissedAsFixed`, `dismissedAsFalsePositive`, `dismissedAsIgnore`, `loginBlocked`, `closedMfaAuto`, `closedMultipleReasons`.|
|closedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [identityRiskEvent](../resources/identityriskevent.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [identityRiskEvent](../resources/identityriskevent.md)|
|userId|String|**TODO: Add Description** Inherited from [identityRiskEvent](../resources/identityriskevent.md)|
|location|[Microsoft.IdentityProtectionServices.signInLocation](../resources/signinlocation.md)|**TODO: Add Description**|
|ipAddress|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [locatedRiskEvent](../resources/locatedriskevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_locatedriskevent_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for Microsoft.IdentityProtectionServices.locatedRiskEvent not found
Content-Type: application/json
Content-length: 447

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.locatedRiskEvent",
  "userDisplayName": "String",
  "userPrincipalName": "String",
  "riskEventDateTime": "String (timestamp)",
  "riskEventType": "String",
  "riskLevel": "String",
  "riskEventStatus": "String",
  "closedDateTime": "String (timestamp)",
  "userId": "String",
  "location": {
    "@odata.type": "microsoft.graph.signInLocation"
  },
  "ipAddress": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.IdentityProtectionServices.locatedRiskEvent"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.locatedRiskEvent",
  "id": "387700e3-00e3-3877-e300-7738e3007738",
  "userDisplayName": "String",
  "userPrincipalName": "String",
  "riskEventDateTime": "String (timestamp)",
  "riskEventType": "String",
  "riskLevel": "String",
  "riskEventStatus": "String",
  "closedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "userId": "String",
  "location": {
    "@odata.type": "microsoft.graph.signInLocation"
  },
  "ipAddress": "String"
}
```

