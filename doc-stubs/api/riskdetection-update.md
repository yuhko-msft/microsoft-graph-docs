---
title: "Update riskDetection"
description: "Update the properties of a riskDetection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update riskDetection
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

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
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|requestId|String|**TODO: Add Description** Optional.|
|resourceTenantId|String|**TODO: Add Description** Optional.|
|crossTenantAccessType|signInAccessType|**TODO: Add Description**. The possible values are: `none`, `b2bCollaboration`, `b2bDirectConnect`, `microsoftSupport`, `serviceProvider`, `unknownFutureValue`. Optional.|
|homeTenantId|String|**TODO: Add Description** Optional.|
|correlationId|String|**TODO: Add Description** Optional.|
|riskEventType|String|**TODO: Add Description** Optional.|
|riskType|riskEventType|**TODO: Add Description**. The possible values are: `unlikelyTravel`, `anonymizedIPAddress`, `maliciousIPAddress`, `unfamiliarFeatures`, `malwareInfectedIPAddress`, `suspiciousIPAddress`, `leakedCredentials`, `investigationsThreatIntelligence`, `generic`, `adminConfirmedUserCompromised`, `mcasImpossibleTravel`, `mcasSuspiciousInboxManipulationRules`, `investigationsThreatIntelligenceSigninLinked`, `maliciousIPAddressValidCredentialsBlockedIP`, `unknownFutureValue`. Optional.|
|riskState|riskState|**TODO: Add Description**. The possible values are: `none`, `confirmedSafe`, `remediated`, `dismissed`, `atRisk`, `confirmedCompromised`, `unknownFutureValue`. Optional.|
|riskLevel|riskLevel|**TODO: Add Description**. The possible values are: `low`, `medium`, `high`, `hidden`, `none`, `unknownFutureValue`. Optional.|
|riskDetail|riskDetail|**TODO: Add Description**. The possible values are: `none`, `adminGeneratedTemporaryPassword`, `userPerformedSecuredPasswordChange`, `userPerformedSecuredPasswordReset`, `adminConfirmedSigninSafe`, `aiConfirmedSigninSafe`, `userPassedMFADrivenByRiskBasedPolicy`, `adminDismissedAllRiskForUser`, `adminConfirmedSigninCompromised`, `hidden`, `adminConfirmedUserCompromised`, `unknownFutureValue`, `adminConfirmedServicePrincipalCompromised`, `adminDismissedAllRiskForServicePrincipal`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `adminConfirmedServicePrincipalCompromised` , `adminDismissedAllRiskForServicePrincipal`. Optional.|
|source|String|**TODO: Add Description** Optional.|
|detectionTimingType|riskDetectionTimingType|**TODO: Add Description**. The possible values are: `notDefined`, `realtime`, `nearRealtime`, `offline`, `unknownFutureValue`. Optional.|
|activity|activityType|**TODO: Add Description**. The possible values are: `signin`, `user`, `unknownFutureValue`, `servicePrincipal`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `servicePrincipal`. Optional.|
|tokenIssuerType|tokenIssuerType|**TODO: Add Description**. The possible values are: `AzureAD`, `ADFederationServices`, `UnknownFutureValue`, `AzureADBackupAuth`, `ADFederationServicesMFAAdapter`, `NPSExtension`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `AzureADBackupAuth` , `ADFederationServicesMFAAdapter` , `NPSExtension`. Optional.|
|ipAddress|String|**TODO: Add Description** Optional.|
|location|[Microsoft.IdentityProtectionServices.signInLocation](../resources/signinlocation.md)|**TODO: Add Description** Optional.|
|activityDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|detectedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|userId|String|**TODO: Add Description** Optional.|
|userType|userType|**TODO: Add Description**. The possible values are: `member`, `guest`, `unknownFutureValue`. Optional.|
|userDisplayName|String|**TODO: Add Description** Optional.|
|userPrincipalName|String|**TODO: Add Description** Optional.|
|additionalInfo|String|**TODO: Add Description** Optional.|



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
PATCH https://graph.microsoft.com/beta/riskDetections/{riskDetectionsId}
Content-Type: application/json
Content-length: 846

{
  "@odata.type": "#microsoft.graph.riskDetection",
  "requestId": "String",
  "resourceTenantId": "String",
  "crossTenantAccessType": "String",
  "homeTenantId": "String",
  "correlationId": "String",
  "riskEventType": "String",
  "riskType": "String",
  "riskState": "String",
  "riskLevel": "String",
  "riskDetail": "String",
  "source": "String",
  "detectionTimingType": "String",
  "activity": "String",
  "tokenIssuerType": "String",
  "ipAddress": "String",
  "location": {
    "@odata.type": "microsoft.graph.signInLocation"
  },
  "activityDateTime": "String (timestamp)",
  "detectedDateTime": "String (timestamp)",
  "lastUpdatedDateTime": "String (timestamp)",
  "userId": "String",
  "userType": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String",
  "additionalInfo": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
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
  "id": "1c66fa1d-fa1d-1c66-1dfa-661c1dfa661c",
  "requestId": "String",
  "resourceTenantId": "String",
  "crossTenantAccessType": "String",
  "homeTenantId": "String",
  "correlationId": "String",
  "riskEventType": "String",
  "riskType": "String",
  "riskState": "String",
  "riskLevel": "String",
  "riskDetail": "String",
  "source": "String",
  "detectionTimingType": "String",
  "activity": "String",
  "tokenIssuerType": "String",
  "ipAddress": "String",
  "location": {
    "@odata.type": "microsoft.graph.signInLocation"
  },
  "activityDateTime": "String (timestamp)",
  "detectedDateTime": "String (timestamp)",
  "lastUpdatedDateTime": "String (timestamp)",
  "userId": "String",
  "userType": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String",
  "additionalInfo": "String"
}
```

