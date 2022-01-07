---
title: "riskDetection resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# riskDetection resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List riskDetections](../api/riskdetection-list.md)|[riskDetection](../resources/riskdetection.md) collection|Get a list of the [riskDetection](../resources/riskdetection.md) objects and their properties.|
|[Create riskDetection](../api/riskdetection-post-riskdetections.md)|[riskDetection](../resources/riskdetection.md)|Create a new [riskDetection](../resources/riskdetection.md) object.|
|[Get riskDetection](../api/riskdetection-get.md)|[riskDetection](../resources/riskdetection.md)|Read the properties and relationships of a [riskDetection](../resources/riskdetection.md) object.|
|[Update riskDetection](../api/riskdetection-update.md)|[riskDetection](../resources/riskdetection.md)|Update the properties of a [riskDetection](../resources/riskdetection.md) object.|
|[Delete riskDetection](../api/riskdetection-delete.md)|None|Deletes a [riskDetection](../resources/riskdetection.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activity|activityType|**TODO: Add Description**. The possible values are: `signin`, `user`, `unknownFutureValue`, `servicePrincipal`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `servicePrincipal`.|
|activityDateTime|DateTimeOffset|**TODO: Add Description**|
|additionalInfo|String|**TODO: Add Description**|
|correlationId|String|**TODO: Add Description**|
|crossTenantAccessType|signInAccessType|**TODO: Add Description**. The possible values are: `none`, `b2bCollaboration`, `b2bDirectConnect`, `microsoftSupport`, `serviceProvider`, `unknownFutureValue`.|
|detectedDateTime|DateTimeOffset|**TODO: Add Description**|
|detectionTimingType|riskDetectionTimingType|**TODO: Add Description**. The possible values are: `notDefined`, `realtime`, `nearRealtime`, `offline`, `unknownFutureValue`.|
|homeTenantId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|ipAddress|String|**TODO: Add Description**|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description**|
|location|[signInLocation](../resources/signinlocation.md)|**TODO: Add Description**|
|requestId|String|**TODO: Add Description**|
|resourceTenantId|String|**TODO: Add Description**|
|riskDetail|riskDetail|**TODO: Add Description**. The possible values are: `none`, `adminGeneratedTemporaryPassword`, `userPerformedSecuredPasswordChange`, `userPerformedSecuredPasswordReset`, `adminConfirmedSigninSafe`, `aiConfirmedSigninSafe`, `userPassedMFADrivenByRiskBasedPolicy`, `adminDismissedAllRiskForUser`, `adminConfirmedSigninCompromised`, `hidden`, `adminConfirmedUserCompromised`, `unknownFutureValue`, `adminConfirmedServicePrincipalCompromised`, `adminDismissedAllRiskForServicePrincipal`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `adminConfirmedServicePrincipalCompromised` , `adminDismissedAllRiskForServicePrincipal`.|
|riskEventType|String|**TODO: Add Description**|
|riskLevel|riskLevel|**TODO: Add Description**. The possible values are: `low`, `medium`, `high`, `hidden`, `none`, `unknownFutureValue`.|
|riskState|riskState|**TODO: Add Description**. The possible values are: `none`, `confirmedSafe`, `remediated`, `dismissed`, `atRisk`, `confirmedCompromised`, `unknownFutureValue`.|
|riskType|riskEventType|**TODO: Add Description**. The possible values are: `unlikelyTravel`, `anonymizedIPAddress`, `maliciousIPAddress`, `unfamiliarFeatures`, `malwareInfectedIPAddress`, `suspiciousIPAddress`, `leakedCredentials`, `investigationsThreatIntelligence`, `generic`, `adminConfirmedUserCompromised`, `mcasImpossibleTravel`, `mcasSuspiciousInboxManipulationRules`, `investigationsThreatIntelligenceSigninLinked`, `maliciousIPAddressValidCredentialsBlockedIP`, `unknownFutureValue`.|
|source|String|**TODO: Add Description**|
|tokenIssuerType|tokenIssuerType|**TODO: Add Description**. The possible values are: `AzureAD`, `ADFederationServices`, `UnknownFutureValue`, `AzureADBackupAuth`, `ADFederationServicesMFAAdapter`, `NPSExtension`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `AzureADBackupAuth` , `ADFederationServicesMFAAdapter` , `NPSExtension`.|
|userDisplayName|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|userType|userType|**TODO: Add Description**. The possible values are: `member`, `guest`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.riskDetection",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.riskDetection",
  "id": "String (identifier)",
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

