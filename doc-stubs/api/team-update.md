---
title: "Update team"
description: "Update the properties of a team object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update team
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [team](../resources/team.md) object.

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
PATCH /teams/{teamsId}
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
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|internalId|String|**TODO: Add Description** Optional.|
|classification|String|**TODO: Add Description** Optional.|
|specialization|teamSpecialization|**TODO: Add Description**. The possible values are: `none`, `educationStandard`, `educationClass`, `educationProfessionalLearningCommunity`, `educationStaff`, `healthcareStandard`, `healthcareCareCoordination`, `unknownFutureValue`. Optional.|
|visibility|teamVisibilityType|**TODO: Add Description**. The possible values are: `private`, `public`, `hiddenMembership`, `unknownFutureValue`. Optional.|
|webUrl|String|**TODO: Add Description** Optional.|
|memberSettings|[Microsoft.Teams.GraphSvc.teamMemberSettings](../resources/teammembersettings.md)|**TODO: Add Description** Optional.|
|guestSettings|[Microsoft.Teams.GraphSvc.teamGuestSettings](../resources/teamguestsettings.md)|**TODO: Add Description** Optional.|
|messagingSettings|[Microsoft.Teams.GraphSvc.teamMessagingSettings](../resources/teammessagingsettings.md)|**TODO: Add Description** Optional.|
|funSettings|[Microsoft.Teams.GraphSvc.teamFunSettings](../resources/teamfunsettings.md)|**TODO: Add Description** Optional.|
|discoverySettings|[Microsoft.Teams.GraphSvc.teamDiscoverySettings](../resources/teamdiscoverysettings.md)|**TODO: Add Description** Optional.|
|isArchived|Boolean|**TODO: Add Description** Optional.|
|isMembershipLimitedToOwners|Boolean|**TODO: Add Description** Optional.|
|tenantId|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [team](../resources/team.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_team"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/teams/{teamsId}
Content-Type: application/json
Content-length: 773

{
  "@odata.type": "#microsoft.graph.team",
  "displayName": "String",
  "description": "String",
  "internalId": "String",
  "classification": "String",
  "specialization": "String",
  "visibility": "String",
  "webUrl": "String",
  "memberSettings": {
    "@odata.type": "microsoft.graph.teamMemberSettings"
  },
  "guestSettings": {
    "@odata.type": "microsoft.graph.teamGuestSettings"
  },
  "messagingSettings": {
    "@odata.type": "microsoft.graph.teamMessagingSettings"
  },
  "funSettings": {
    "@odata.type": "microsoft.graph.teamFunSettings"
  },
  "discoverySettings": {
    "@odata.type": "microsoft.graph.teamDiscoverySettings"
  },
  "isArchived": "Boolean",
  "isMembershipLimitedToOwners": "Boolean",
  "tenantId": "String"
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
  "@odata.type": "#microsoft.graph.team",
  "id": "8931a665-a665-8931-65a6-318965a63189",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "description": "String",
  "internalId": "String",
  "classification": "String",
  "specialization": "String",
  "visibility": "String",
  "webUrl": "String",
  "memberSettings": {
    "@odata.type": "microsoft.graph.teamMemberSettings"
  },
  "guestSettings": {
    "@odata.type": "microsoft.graph.teamGuestSettings"
  },
  "messagingSettings": {
    "@odata.type": "microsoft.graph.teamMessagingSettings"
  },
  "funSettings": {
    "@odata.type": "microsoft.graph.teamFunSettings"
  },
  "discoverySettings": {
    "@odata.type": "microsoft.graph.teamDiscoverySettings"
  },
  "isArchived": "Boolean",
  "isMembershipLimitedToOwners": "Boolean",
  "tenantId": "String"
}
```

