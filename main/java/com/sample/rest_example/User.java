package com.sample.rest_example;

public class User {
	int id;
	String hierarchyPath;
	String code;
	String deleted;
	int role;
	int headStaffLineId;
	String name;
	int strategySubdivisionId;
	int parentId;
	
	public User(){}
	
	public User(int id, String hierarchyPath, String code, String deleted,
			int role, int headStaffLineId, String name,
			int strategySubdivisionId, int parentId) {
		super();
		this.id = id;
		this.hierarchyPath = hierarchyPath;
		this.code = code;
		this.deleted = deleted;
		this.role = role;
		this.headStaffLineId = headStaffLineId;
		this.name = name;
		this.strategySubdivisionId = strategySubdivisionId;
		this.parentId = parentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHierarchyPath() {
		return hierarchyPath;
	}

	public void setHierarchyPath(String hierarchyPath) {
		this.hierarchyPath = hierarchyPath;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getHeadStaffLineId() {
		return headStaffLineId;
	}

	public void setHeadStaffLineId(int headStaffLineId) {
		this.headStaffLineId = headStaffLineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrategySubdivisionId() {
		return strategySubdivisionId;
	}

	public void setStrategySubdivisionId(int strategySubdivisionId) {
		this.strategySubdivisionId = strategySubdivisionId;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", hierarchyPath=" + hierarchyPath
				+ ", code=" + code + ", deleted=" + deleted + ", role=" + role
				+ ", headStaffLineId=" + headStaffLineId + ", name=" + name
				+ ", strategySubdivisionId=" + strategySubdivisionId
				+ ", parentId=" + parentId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
		result = prime * result + headStaffLineId;
		result = prime * result
				+ ((hierarchyPath == null) ? 0 : hierarchyPath.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + parentId;
		result = prime * result + role;
		result = prime * result + strategySubdivisionId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (deleted == null) {
			if (other.deleted != null)
				return false;
		} else if (!deleted.equals(other.deleted))
			return false;
		if (headStaffLineId != other.headStaffLineId)
			return false;
		if (hierarchyPath == null) {
			if (other.hierarchyPath != null)
				return false;
		} else if (!hierarchyPath.equals(other.hierarchyPath))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parentId != other.parentId)
			return false;
		if (role != other.role)
			return false;
		if (strategySubdivisionId != other.strategySubdivisionId)
			return false;
		return true;
	}
	
}
