---
title: "Working with the Azure AD entitlement management API"
description: "Govern access to resources including groups, apps and sites through Azure AD entitlement management"
ms.localizationpriority: medium
author: "markwahl-msft"
ms.prod: "governance"
doc_type: "conceptualPageType"
---

# Working with the Azure AD entitlement management API

Namespace: microsoft.graph

Azure Active Directory (Azure AD) entitlement management can help you manage access to groups, applications, and SharePoint Online sites for internal users as well as users outside your organization.

By creating access packages with the roles users need to have across those resources, and defining policies for who can request an access package and how long they can have an assignment to an access package, you can govern the lifecycle of access for both internal and external users.

The entitlement management resource types include:

- [accessPackage](accesspackage.md): Defines the collections of resource roles and the policies for how one or more users may obtain access to those resources.
- accessPackageAssignmentPolicy: Specifies the policy by which subjects may request or be assigned an access package via an access package assignment.
- [accessPackageAssignmentRequest](accesspackageassignmentrequest.md): Created by a user who wishes to obtain an access package assignment.
- [accessPackageAssignment](accesspackageassignment.md): An assignment of an access package to a particular subject, for a period of time.
- [accessPackageCatalog](accesspackagecatalog.md): A container for access packages.
- [connectedOrganization](connectedorganization.md): A connected organization for external users who can request access.
- [entitlementManagementSettings](entitlementmanagementsettings.md): Tenant-wide settings for Azure AD entitlement management.
- [approval](approval.md): represents the decisions associated with an access package request.

Note that the entitlement management feature, including the API, is included in Azure AD Premium P2. The tenant where entitlement management is being used must have a valid purchased or trial Azure AD Premium P2 or EMS E5 subscription.

The following table lists the methods that you can use to interact with entitlement management-related resources.

## Methods

| Method   | Return type |Description|
|:---------------|:--------|:----------|
| [Get](../api/entitlementmanagementsettings-get.md) | [entitlementManagementSettings](entitlementmanagementsettings.md) | Read the properties of an **entitlementManagementSettings** object. |
| [Update](../api/entitlementmanagementsettings-update.md) | [entitlementManagementSettings](entitlementmanagementsettings.md) | Update the properties of an **entitlementManagementSettings** object. |
| [List accessPackages](../api/entitlementmanagement-list-accesspackages.md) | [accessPackage](accesspackage.md) collection | Retrieve a list of **accessPackage** objects. |
| [Create accessPackage](../api/entitlementmanagement-post-accesspackages.md) | [accessPackage](accesspackage.md) | Create a new **accessPackage** object. |
| [Get accessPackage](../api/accesspackage-get.md) | [accessPackage](accesspackage.md) | Read properties and relationships of an **accessPackage** object. |
| [Update accessPackage](../api/accesspackage-update.md)|None | Update the properties of an **accesspackage** object. |
| [Delete accessPackage](../api/accesspackage-delete.md) | | Delete **accessPackage**. |
| [FilterByCurrentUser](../api/accesspackage-filterbycurrentuser.md) | [accessPackage](accesspackage.md) collection | Retrieve a list of **accessPackage** objects filtered on the signed-in user. |
| [List accessPackageAssignmentRequests](../api/entitlementmanagement-list-assignmentrequests.md) | [accessPackageAssignmentRequest](accesspackageassignmentrequest.md) collection | Retrieve a list of **accessPackageAssignmentRequest** objects. |
| [Get accessPackageAssignmentRequest](../api/accesspackageassignmentrequest-get.md) | [accessPackageAssignmentRequest](accesspackageassignmentrequest.md) | Read properties and relationships of an **accessPackageAssignmentRequest** object. |
| [Delete accessPackageAssignmentRequest](../api/accesspackageassignmentrequest-delete.md) |None | Delete an **accessPackageAssignmentRequest**. |
|[FilterByCurrentUser](../api/accesspackageassignmentrequest-filterbycurrentuser.md)|[accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) collection|Retrieve the list of **accessPackageAssignmentRequest** objects filtered on the signed-in user.|
|[cancel](../api/accesspackageassignmentrequest-cancel.md)|[accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) collection|Cancel an **accessPackageAssignmentRequest** object that is in a cancellable state: `accepted`, `pendingApproval`, `pendingNotBefore`, `pendingApprovalEscalated`.|
| [List accessPackageAssignments](../api/entitlementmanagement-list-assignments.md) | [accessPackageAssignment](accesspackageassignment.md) collection | Retrieve a list of **accessPackageAssignment** objects. |
|[FilterByCurrentUser](../api/accesspackageassignment-filterbycurrentuser.md)|[accessPackageAssignment](../resources/accesspackageassignment.md) collection|Retrieve the list of **accessPackageAssignment** objects filtered on the signed-in user.|
| [List accessPackageCatalogs](../api/entitlementmanagement-list-catalogs.md) | [accessPackageCatalog](accesspackagecatalog.md) collection | Retrieve a list of **accessPackageCatalogs** objects. |
| [Create accessPackageCatalog](../api/entitlementmanagement-post-catalogs.md) | [accessPackageCatalog](accesspackagecatalog.md) | Create a new **accessPackageCatalog** object. |
| [Get accessPackageCatalog](../api/accesspackagecatalog-get.md) | [accessPackageCatalog](accesspackagecatalog.md) | Read properties and relationships of an **accessPackageCatalog** object. |
| [Update accessPackageCatalog](../api/accesspackagecatalog-update.md)|None | Update the properties of an **accessPackageCatalog** object. |
| [Delete accessPackageCatalog](../api/accesspackagecatalog-delete.md) | | Delete an **accessPackageCatalog**. |
| [List connectedOrganizations](../api/entitlementmanagement-list-connectedorganizations.md) | [connectedOrganization](connectedorganization.md) collection | Retrieve a list of **connectedOrganization** objects. |
| [Create connectedOrganization](../api/entitlementmanagement-post-connectedorganizations.md) | [connectedOrganization](connectedorganization.md) | Create a new **connectedOrganization** object. |
| [Get connectedOrganization](../api/connectedorganization-get.md) | [connectedOrganization](connectedorganization.md) | Read properties and relationships of a **connectedOrganization** object. |
| [Update connectedOrganization](../api/connectedorganization-update.md) |None | Update a **connectedOrganization**. |
| [Delete connectedOrganization](../api/connectedorganization-delete.md) |None | Delete a **connectedOrganization**. |
|[List internalSponsors](../api/connectedorganization-list-internalsponsors.md) | [directoryObject](directoryobject.md) collection | Retrieve a list of a **connectedOrganization's** internal sponsors. |
|[List externalSponsors](../api/connectedorganization-list-externalsponsors.md) | [directoryObject](directoryobject.md) collection | Retrieve a list of a **connectedOrganization's** external sponsors. |
|[Add internalSponsors](../api/connectedorganization-post-internalsponsors.md) | None | Add a user or group to a **connectedOrganization's** internal sponsors. |
|[Add externalSponsors](../api/connectedorganization-post-externalsponsors.md) | None | Add a user or group to a **connectedOrganization's** external sponsors. |
|[Remove internalSponsors](../api/connectedorganization-delete-internalsponsors.md) | None | Remove a user or group from a **connectedOrganization's** internal sponsors. |
|[Remove externalSponsors](../api/connectedorganization-delete-externalsponsors.md) | None | Remove a user or group from a **connectedOrganization's** external sponsors. |

## See also

- [What is Azure AD entitlement management?](/azure/active-directory/governance/entitlement-management-overview)
- [subjectSet](subjectset.md) subtypes [singleUser](singleuser.md), [groupMembers](groupmembers.md), [connectedOrganizationMembers](connectedorganizationmembers.md), [requestorManager](requestormanager.md), [internalSponsors](internalsponsors.md), and [externalSponsors](externalsponsors.md).
- [accessPackageSubject](accesspackagesubject.md) - Used in the [accessPackageAssignment](accesspackageassignment.md) as a subject user who has an access package assignment.
- [identitySource](identitysource.md) - used in the [connectedOrganization](connectedorganization.md), one of [azureActiveDirectoryTenant](azureactivedirectorytenant.md), [domainIdentitySource](domainidentitysource.md) or [externalDomainFederation](externaldomainfederation.md).

