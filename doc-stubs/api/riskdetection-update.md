---
title: "Update riskDetection"
description: "Update the properties of a riskDetection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update riskDetection
Namespace: microsoft.graph



Update the properties of a [riskDetection](../resources/riskdetection.md) object.

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
PATCH /riskDetections/{riskDetectionsId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [riskDetection](../resources/riskdetection.md) object.

The following table shows the properties that are required when you update the [riskDetection](../resources/riskdetection.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activity|activityType|**TODO: Add Description**. Possible values are: `signin`, `user`, `unknownFutureValue`.|
|activityDateTime|DateTimeOffset|**TODO: Add Description**|
|additionalInfo|String|**TODO: Add Description**|
|correlationId|String|**TODO: Add Description**|
|detectedDateTime|DateTimeOffset|**TODO: Add Description**|
|detectionTimingType|riskDetectionTimingType|**TODO: Add Description**. Possible values are: `notDefined`, `realtime`, `nearRealtime`, `offline`, `unknownFutureValue`.|
|ipAddress|String|**TODO: Add Description**|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description**|
|location|[signInLocation](../resources/signinlocation.md)|**TODO: Add Description**|
|requestId|String|**TODO: Add Description**|
|riskDetail|riskDetail|**TODO: Add Description**. Possible values are: `none`, `adminGeneratedTemporaryPassword`, `userPerformedSecuredPasswordChange`, `userPerformedSecuredPasswordReset`, `adminConfirmedSigninSafe`, `aiConfirmedSigninSafe`, `userPassedMFADrivenByRiskBasedPolicy`, `adminDismissedAllRiskForUser`, `adminConfirmedSigninCompromised`, `hidden`, `adminConfirmedUserCompromised`, `unknownFutureValue`.|
|riskEventType|String|**TODO: Add Description**|
|riskLevel|riskLevel|**TODO: Add Description**. Possible values are: `low`, `medium`, `high`, `hidden`, `none`, `unknownFutureValue`.|
|riskState|riskState|**TODO: Add Description**. Possible values are: `none`, `confirmedSafe`, `remediated`, `dismissed`, `atRisk`, `confirmedCompromised`, `unknownFutureValue`.|
|riskType|riskEventType|**TODO: Add Description**. Possible values are: `unlikelyTravel`, `anonymizedIPAddress`, `maliciousIPAddress`, `unfamiliarFeatures`, `malwareInfectedIPAddress`, `suspiciousIPAddress`, `leakedCredentials`, `investigationsThreatIntelligence`, `generic`, `adminConfirmedUserCompromised`, `mcasImpossibleTravel`, `mcasSuspiciousInboxManipulationRules`, `investigationsThreatIntelligenceSigninLinked`, `maliciousIPAddressValidCredentialsBlockedIP`, `unknownFutureValue`.|
|source|String|**TODO: Add Description**|
|tokenIssuerType|tokenIssuerType|**TODO: Add Description**. Possible values are: `AzureAD`, `ADFederationServices`, `UnknownFutureValue`.|
|userDisplayName|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [riskDetection](../resources/riskdetection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_riskdetection"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/riskDetections/{riskDetectionsId}
Content-Type: application/json
Content-length: 721

{
  "@odata.type": "#microsoft.graph.riskDetection",
  "activity": "String",
  "activityDateTime": "String (timestamp)",
  "additionalInfo": "String",
  "correlationId": "String",
  "detectedDateTime": "String (timestamp)",
  "detectionTimingType": "String",
  "ipAddress": "String",
  "lastUpdatedDateTime": "String (timestamp)",
  "location": {
    "@odata.type": "microsoft.graph.signInLocation"
  },
  "requestId": "String",
  "riskDetail": "String",
  "riskEventType": "String",
  "riskLevel": "String",
  "riskState": "String",
  "riskType": "String",
  "source": "String",
  "tokenIssuerType": "String",
  "userDisplayName": "String",
  "userId": "String",
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
  "@odata.type": "#microsoft.graph.riskDetection",
  "id": "691b60f2-60f2-691b-f260-1b69f2601b69",
  "activity": "String",
  "activityDateTime": "String (timestamp)",
  "additionalInfo": "String",
  "correlationId": "String",
  "detectedDateTime": "String (timestamp)",
  "detectionTimingType": "String",
  "ipAddress": "String",
  "lastUpdatedDateTime": "String (timestamp)",
  "location": {
    "@odata.type": "microsoft.graph.signInLocation"
  },
  "requestId": "String",
  "riskDetail": "String",
  "riskEventType": "String",
  "riskLevel": "String",
  "riskState": "String",
  "riskType": "String",
  "source": "String",
  "tokenIssuerType": "String",
  "userDisplayName": "String",
  "userId": "String",
  "userPrincipalName": "String"
}
```

