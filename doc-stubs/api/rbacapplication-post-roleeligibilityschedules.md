---
title: "Create unifiedRoleEligibilitySchedule"
description: "Create a new unifiedRoleEligibilitySchedule object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create unifiedRoleEligibilitySchedule
Namespace: microsoft.graph



Create a new unifiedRoleEligibilitySchedule object.

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
POST /roleManagement/directory/roleEligibilitySchedules
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRoleEligibilitySchedule](../resources/unifiedroleeligibilityschedule.md) object.

The following table shows the properties that are required when you create the [unifiedRoleEligibilitySchedule](../resources/unifiedroleeligibilityschedule.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appScopeId|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|createdUsing|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|directoryScopeId|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|principalId|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|roleDefinitionId|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|status|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|memberType|String|**TODO: Add Description**|
|scheduleInfo|[requestSchedule](../resources/requestschedule.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [unifiedRoleEligibilitySchedule](../resources/unifiedroleeligibilityschedule.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_unifiedroleeligibilityschedule_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/roleManagement/directory/roleEligibilitySchedules
Content-Type: application/json
Content-length: 353

{
  "@odata.type": "#microsoft.graph.unifiedRoleEligibilitySchedule",
  "appScopeId": "String",
  "createdUsing": "String",
  "directoryScopeId": "String",
  "principalId": "String",
  "roleDefinitionId": "String",
  "status": "String",
  "memberType": "String",
  "scheduleInfo": {
    "@odata.type": "microsoft.graph.requestSchedule"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unifiedRoleEligibilitySchedule"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.unifiedRoleEligibilitySchedule",
  "id": "dc611847-1847-dc61-4718-61dc471861dc",
  "appScopeId": "String",
  "createdDateTime": "String (timestamp)",
  "createdUsing": "String",
  "directoryScopeId": "String",
  "modifiedDateTime": "String (timestamp)",
  "principalId": "String",
  "roleDefinitionId": "String",
  "status": "String",
  "memberType": "String",
  "scheduleInfo": {
    "@odata.type": "microsoft.graph.requestSchedule"
  }
}
```

