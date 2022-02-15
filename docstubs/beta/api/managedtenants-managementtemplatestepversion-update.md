---
title: "Update managementTemplateStepVersion"
description: "Update the properties of a managementTemplateStepVersion object."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: apiPageType
---

# Update managementTemplateStepVersion
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|ManagedTenants.Read.All, ManagedTenants.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /tenantRelationships/managedTenants/managementTemplateStepVersions/{managementTemplateStepVersionId}
PATCH /tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}/acceptedVersion
PATCH /tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}/versions/{managementTemplateStepVersionId}
PATCH /tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}/versions/{managementTemplateStepVersionId}/deployments/{managementTemplateStepDeploymentId}/templateStepVersion
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
|version|Int32|**TODO: Add Description** Optional.|
|name|String|**TODO: Add Description** Optional.|
|versionInformation|String|**TODO: Add Description** Optional.|
|contentMarkdown|String|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|createdByUserId|String|**TODO: Add Description** Optional.|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastActionByUserId|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_managementtemplatestepversion"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/tenantRelationships/managedTenants/managementTemplateStepVersions/{managementTemplateStepVersionId}
Content-Type: application/json
Content-length: 313

{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStepVersion",
  "version": "Integer",
  "name": "String",
  "versionInformation": "String",
  "contentMarkdown": "String",
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
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStepVersion",
  "id": "a1833f45-63b7-7511-72df-4a2381f63d89",
  "version": "Integer",
  "name": "String",
  "versionInformation": "String",
  "contentMarkdown": "String",
  "createdDateTime": "String (timestamp)",
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```

