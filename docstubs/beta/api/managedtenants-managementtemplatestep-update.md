---
title: "Update managementTemplateStep"
description: "Update the properties of a managementTemplateStep object."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: apiPageType
---

# Update managementTemplateStep
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) object.

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
PATCH /tenantRelationships/managedTenants/managementTemplateSteps/{managementTemplateStepId}
PATCH /tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}
PATCH /tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}/versions/{managementTemplateStepVersionId}/acceptedFor
PATCH /tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}/versions/{managementTemplateStepVersionId}/templateStep
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
|displayName|String|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|priority|Int32|**TODO: Add Description** Optional.|
|category|managementCategory|**TODO: Add Description**. The possible values are: `custom`, `devices`, `identity`, `data`, `unknownFutureValue`. Optional.|
|portalLink|[microsoft.graph.actionUrl](../resources/actionurl.md)|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|createdByUserId|String|**TODO: Add Description** Optional.|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastActionByUserId|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_managementtemplatestep"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/tenantRelationships/managedTenants/managementTemplateSteps/{managementTemplateStepId}
Content-Type: application/json
Content-length: 373

{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStep",
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "category": "String",
  "portalLink": {
    "@odata.type": "microsoft.graph.actionUrl"
  },
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
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
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStep",
  "id": "62159df4-07df-01f4-56c9-c610f94506f1",
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "category": "String",
  "portalLink": {
    "@odata.type": "microsoft.graph.actionUrl"
  },
  "createdDateTime": "String (timestamp)",
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```

